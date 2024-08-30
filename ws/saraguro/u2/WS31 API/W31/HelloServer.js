const http = require('node:http');
const hostname = '127.0.0.1';
const port = 3019;
const server = http.createServer((req, res) => {
  res.statusCode = 200; //el 200 significa que la solicitud ha tenido éxito
  res.setHeader('Content-Type', 'text/plain');
  res.end('Hello Leidy Saraguro\n');
});
server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});
