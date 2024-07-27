const http = require('node:http');

const hostname = '127.0.0.1';

const port = 3015;

const server = http.createServer((req,res ) => {
    res.statuscode = 200;
    res.setHeader ('Content-type','text/plain');
    res.end('Hello, Leydi Esperanza Oña Suquillo\n');

});

server.listen(port,hostname,()=>{
    console.log(`Server running at http://${hostname}:${port}/`);
})