import express from 'express'; // Import express
import { engine as handlebars } from "express-handlebars"; // Import handlebars
import bodyParser from 'body-parser';
import post from './models/post.js'; // Import your post model

const app = express(); // Initialize express

app.engine('handlebars', handlebars({ defaultLayout: "main" }));
// Define handlebars as the layout engine with "main" as the default layout
app.set("view engine", "handlebars");
// Set handlebars as the view engine

app.use(bodyParser.urlencoded({ extended: false })); // Use bodyParser to process form data
app.use(bodyParser.json()); // Use bodyParser to process JSON data

// Route for the homepage
app.get("/", function (req, res) {
    res.render("primeira_pagina"); // You might want to render an actual view here
});

// Route for creating a new post
app.post("/cadastrar", function (req, res) {
    post.create({
        nome: req.body.nome,
        telefone: req.body.telefone,
        origem: req.body.origem,
        data_contato: req.body.data_contato,
        observacao: req.body.observacao
    })
    .then(function () {
        res.redirect('/'); // Redirect to the homepage after successful post creation
    })
    .catch(function (erro) {
        res.status(500).send('Erro ao criar o post: ' + erro); // Handle errors and send an error message
    });
});

// Start the server on port 8081
app.listen(8081, function () {
    console.log("Servidor Ativo");
});
