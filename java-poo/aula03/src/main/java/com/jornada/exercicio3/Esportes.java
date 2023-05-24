package com.jornada.exercicio3;

public enum Esportes {
    FUTEBOL("É um esporte de equipe jogado entre duas equipes de 11 jogadores cada. O objetivo é marcar gols ao colocar a bola na rede do adversário usando os pés, cabeça ou outras partes do corpo, exceto as mãos. O futebol é um esporte popular em todo o mundo, conhecido por sua natureza competitiva, habilidades técnicas e táticas."),
    BASQUETE("É um esporte de equipe jogado entre duas equipes de cinco jogadores cada. O objetivo é marcar pontos ao arremessar a bola em uma cesta elevada do adversário. O basquete é caracterizado por movimentos rápidos, habilidades de drible, passes precisos e arremessos precisos. É jogado tanto em nível recreativo como profissional."),
    NATACAO("É um esporte individual ou de equipe praticado na água. Envolve nadar utilizando diferentes estilos de nado, como crawl, costas, peito e borboleta. A natação é conhecida por ser uma atividade física completa, que melhora a resistência cardiovascular, a força muscular e a coordenação. Além de ser um esporte competitivo, também é uma atividade recreativa e uma forma de exercício popular."),
    JIUJITSU("É uma arte marcial de origem japonesa que enfatiza técnicas de luta no chão. O jiu-jitsu busca utilizar alavancas e estrangulamentos para controlar e subjugar o oponente. É um esporte que combina força, técnica e estratégia, permitindo que praticantes menores e mais fracos vençam oponentes maiores e mais fortes."),
    VOLEI(" É um esporte de equipe jogado entre duas equipes de seis jogadores cada. O objetivo é passar a bola por cima de uma rede para a quadra adversária e fazê-la tocar o chão do outro lado, enquanto se defende contra os ataques da equipe adversária. O vôlei é conhecido pela sua ação rápida, movimentos acrobáticos e trabalho em equipe."),
    CROSSFIT("É um programa de treinamento físico que combina diferentes modalidades, como levantamento de peso, exercícios cardiovasculares, ginástica e outros. O crossfit visa melhorar a resistência, a força, a flexibilidade e outras capacidades físicas. Os treinos de crossfit são intensos e variados, normalmente realizados em um ambiente de grupo sob a orientação de um instrutor.");

    private String resumo;

    Esportes(String resumo) {
        this.resumo = resumo;
    }

    public String getResumoEsporte() {
        return this.resumo;
    }
    }
