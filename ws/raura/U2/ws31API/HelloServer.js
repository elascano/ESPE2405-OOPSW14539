const http = require('node:http');

const hostname = '127.0.0.1';
const port = 3018;

//declarar servidor
const server = http.createServer((req,res) =>{
    res.statusCode = 200; //200 =todo bien
    res.setHeader('Content-Type','text/plain');
    res.end('Hello, Santi!\n');
});

//levantar servidor
server.listen(port, hostname, () => {
    console.log('Server running at http://${hostname}:${port}/');

})