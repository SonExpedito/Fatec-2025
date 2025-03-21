import { Sequelize, sequelize } from './banco.js';  // Importação correta usando ES Modules

const Agendamentos = sequelize.define('agendamentos', {
    nome: {
        type: Sequelize.STRING
    },
    telefone: {
        type: Sequelize.STRING
    },
    origem: {
        type: Sequelize.STRING
    },
    data_contato: {
        type: Sequelize.DATE
    },
    observacao: {
        type: Sequelize.TEXT
    },
});

//Agendamentos.sync({ force: true });

export default Agendamentos;  // Usando export default para exportar o modelo
