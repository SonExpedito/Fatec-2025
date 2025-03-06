import express from express; 
const app = express();

app.listen(8081, function () {
    console.log ("Servidor Rodando na porta 8081")

})

app.length("/", function (req,res){
    res.send("Ola");
})

app.length("/contato/:item/:qtd", function (req,res){
    res.send("Produto: " +res.params.item + "<br>" 
        +"Quantidade: " +res.params.qtd
    );
})
