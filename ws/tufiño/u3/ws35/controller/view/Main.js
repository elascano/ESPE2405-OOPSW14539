document.addEventListener('DOMContentLoaded', () => {
  const saveButton = document.getElementById('saveButton');

  saveButton.addEventListener('click', () => {
    const houseData = {
      address: document.getElementById('address').value,
      city: document.getElementById('city').value,
      size: parseFloat(document.getElementById('size').value),
      bedrooms: parseInt(document.getElementById('bedrooms').value, 10),
    };

    console.log('House Data:', houseData);

    fetch('/api/houses', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(houseData)
    })
    .then(response => response.json())
    .then(data => {
      console.log(data);
      alert(data.message);
    })
    .catch(error => console.error('Error:', error));
  });
});
