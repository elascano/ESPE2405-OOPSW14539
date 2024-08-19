document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('friendForm');
    const saveButton = document.getElementById('saveButton');
    const cancelButton = document.getElementById('cancelButton');
    
    // Elementos de fecha de nacimiento
    const birthDay = document.getElementById('birthDay');
    const birthMonth = document.getElementById('birthMonth');
    const birthYear = document.getElementById('birthYear');

    saveButton.addEventListener('click', () => {
        const friendData = {
            name: document.getElementById('name').value,
            lastName: document.getElementById('lastName').value,
            birthDate: new Date(
                birthYear.value,
                birthMonth.value - 1, 
                birthDay.value
            ).toISOString(), 
            email: document.getElementById('email').value,
            phone: document.getElementById('phone').value
        };
    
        console.log('Friend Data:', friendData);
    
        fetch('/api/friends', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(friendData)
        })
        .then(response => response.json())
        .then(data => {
            console.log('Respuesta del servidor:', data);
            if (data.friend && data.friend.age !== undefined) {
                console.log('Edad calculada:', data.friend.age);
            } else {
                console.log('La edad no se calculó correctamente');
            }
        })
        .catch(error => console.error('Error:', error));
    });

    cancelButton.addEventListener('click', () => {
        form.reset();
    });
});
