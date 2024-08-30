document.getElementById('playerForm').addEventListener('submit', async (e) => {
    e.preventDefault();

    const player = {
        id: document.getElementById('id').value,
        name: document.getElementById('name').value,
        age: document.getElementById('age').value,
        goals: document.getElementById('goals').value,
        matchesPlayed: document.getElementById('matchesPlayed').value
    };

    try {
        const response = await fetch('/players/player', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(player)
        });

        if (response.ok) {
            alert('Player added successfully!');
            document.getElementById('playerForm').reset();
        } else {
            alert('Failed to add player.');
        }
    } catch (error) {
        console.error('Error:', error);
        alert('An error occurred while adding the player.');
    }
});
