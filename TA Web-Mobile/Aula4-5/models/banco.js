import { Sequelize } from "sequelize";

const sequelize = new Sequelize('projetoweb', 'root', '', {
    host: 'localhost',
    dialect: 'mysql'
});

export { Sequelize, sequelize };  // Exportando os valores usando ES6
