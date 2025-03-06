import express from 'express';
import { fileURLToPath } from 'url'; 
import { dirname } from 'path'; 

const app = express();

// Get the current directory equivalent of __dirname
const __filename = fileURLToPath(import.meta.url);
const __dirname = dirname(__filename);

app.listen(8081, function () {
    console.log("Servidor Rodando na porta 8081");
});

app.get("/", function(req, res) {
    res.sendFile(__dirname + "/html/index.html");
});

app.get("/contato", function(req, res) {
    res.send("Página de Contato");
});

app.get("/produtos/:item/:qtd", function(req, res) {
    res.send("Produto: " + req.params.item + " <br> Quantidade: " + req.params.qtd);
});
