import express from 'express';
import { engine as handlebars } from "express-handlebars";

const app = express();


app.engine('handlebars', handlebars({defaultLayout: "main"}))
app.set("view engine", "handlebars");

app.get("/", function (req,res){
    res.render("primeira_pagina")
})

app.listen(8081,function(){
    console.log ("Servidor Ativo")
})