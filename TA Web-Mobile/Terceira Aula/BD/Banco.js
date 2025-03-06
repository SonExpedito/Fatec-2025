import { Sequelize } from "sequelize";

//Dados do Banco

const sequelize = new Sequelize('exemplo2', 'root', '', {
    host: 'localhost',
    dialect: 'mysql'
})

//Verificação
sequelize.authenticate().then(function () {
    console.log('Conectado com Sucesso');

}).catch(function (erro) {
    console.log("Falha ao se conectar: " + erro)
})

//Criação de Tabela
const Agendamentos = sequelize.define("agendamentos", {
    nome: {
        type: Sequelize.STRING,
    },
    email: {
        type: Sequelize.STRING,
    },
    telefone: {
        type: Sequelize.STRING,
    },
    cpf: {
        type: Sequelize.STRING,
    },
    data: {
        type: Sequelize.STRING,
    },
    hora: {
        type: Sequelize.STRING,
    },
});

//Agendamentos.sync({ force: true });


//Criação de Registro
Agendamentos.create({
    nome: "Alex",
    email: "teste@gmail.com",
    telefone: "1123456789",
    cpf: "12345678900",
    data: "2025-02-27",
    hora: "20:38",
});