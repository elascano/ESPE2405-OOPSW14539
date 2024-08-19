document.getElementById('storeForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const id = document.getElementById('id').value;
    const name = document.getElementById('name').value;
    const location = document.getElementById('location').value;
    const revenue = document.getElementById('revenue').value;
    const numberOfEmployees = document.getElementById('numberOfEmployees').value;
    const storeType = document.getElementById('storeType').value;

    fetch('/addStore', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ id, name, location, revenue, numberOfEmployees, storeType })
    })
    .then(response => response.text())
    .then(message => {
        document.getElementById('message').innerText = message;
    })
    .catch(error => console.error('Error:', error));
});
