import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tarefa {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Minha Janela");
        janela.setSize(650, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();

        JPanel painelMenu = new JPanel();
        painelMenu.setLayout(null);

        JPanel painelNota = new JPanel();
        JPanel painelDiciplna = new JPanel();
        JPanel painelAluno = new JPanel();

        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setBounds(150, 180, 100, 30);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(125, 210, 150, 30);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(150, 260, 100, 30);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(125, 290, 150, 30);

        JButton botaoLogin = new JButton("Login");
        botaoLogin.setBounds(125, 350, 150, 30);

        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = campoSenha.getText();

                if (usuario.equals("Professor") && senha.equals("ProfessorDoAno")) {
                    janela.setContentPane(painelMenu);

                    janela.revalidate();
                    janela.repaint();
                } else {
                    JOptionPane.showMessageDialog(
                            janela,
                            "Usuário não existe!");
                }
            }
        });

        // Adições do painelMenu

        JButton botaoAluno = new JButton("Alunos");
        botaoAluno.setBounds(200, 200, 120, 50);

        JButton botaoDisciplina = new JButton("Disciplinas");
        botaoDisciplina.setBounds(340, 200, 120, 50);

        JButton botaoNotas = new JButton("Notas");
        botaoNotas.setBounds(480, 200, 120, 50);

        painelMenu.add(botaoAluno);
        painelMenu.add(botaoDisciplina);
        painelMenu.add(botaoNotas);

        botaoAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.setContentPane(painelAluno);

                janela.revalidate();
                janela.repaint();
            }
        });

        botaoDisciplina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.setContentPane(painelDiciplna);

                janela.revalidate();
                janela.repaint();
            }
        });

        botaoNotas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.setContentPane(painelNota);

                janela.revalidate();
                janela.repaint();
            }
        });

        painelMenu.setSize(1000, 800);
        painelMenu.setLayout(null);
        painelMenu.setVisible(true);

        painel.add(labelUsuario);
        painel.add(campoUsuario);
        painel.add(labelSenha);
        painel.add(campoSenha);
        painel.add(botaoLogin);

        painel.setLayout(null);

        janela.add(painel);

        janela.setVisible(true);

        // Adições do painel aluno
        JButton botaoMenu = new JButton("Menu");
        botaoMenu.setBounds(20, 20, 100, 30);

        JLabel titulo = new JLabel("Adicionar Aluno");
        titulo.setBounds(280, 30, 300, 50);
        titulo.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel labelNome = new JLabel("Nome do Aluno:");
        labelNome.setBounds(150, 120, 150, 30);

        JTextField campoNome = new JTextField();
        campoNome.setBounds(270, 120, 200, 30);

        JButton botaoAdicionar = new JButton("Adicionar");
        botaoAdicionar.setBounds(490, 120, 100, 30);

        JLabel labelResultado = new JLabel("");
        labelResultado.setBounds(150, 170, 300, 30);

        JTextArea areaSalvos = new JTextArea();
        areaSalvos.setBounds(150, 210, 440, 250);
        areaSalvos.setEditable(false);

        botaoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.setContentPane(painelMenu);

                janela.revalidate();
                janela.repaint();
            }
        });

        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                labelResultado.setText("Salvo: " + nome);

                if (!nome.isEmpty()) {
                    areaSalvos.append("Aluno Salvo: " + nome + "\n");
                    campoNome.setText("");
                }
            }
        });

        painelAluno.add(botaoMenu);
        painelAluno.add(titulo);
        painelAluno.add(labelNome);
        painelAluno.add(campoNome);
        painelAluno.add(botaoAdicionar);
        painelAluno.add(labelResultado);
        painelAluno.add(areaSalvos);

        painelAluno.setSize(800, 800);
        painelAluno.setLayout(null);
        painelAluno.setVisible(true);

        // Adições do painel diciplina

        JButton botaoMenuD = new JButton("Menu");
        botaoMenuD.setBounds(20, 20, 100, 30);

        JLabel tituloD = new JLabel("Adicionar Disciplina");
        tituloD.setBounds(250, 30, 350, 50);
        tituloD.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel labelNomeD = new JLabel("Nome da Disciplina:");
        labelNomeD.setBounds(130, 120, 150, 30);

        JTextField campoNomeD = new JTextField();
        campoNomeD.setBounds(270, 120, 200, 30);

        JButton botaoAdicionarD = new JButton("Adicionar");
        botaoAdicionarD.setBounds(490, 120, 100, 30);

        JLabel labelResultadoD = new JLabel("");
        labelResultadoD.setBounds(150, 170, 300, 30);

        JTextArea areaSalvosD = new JTextArea();
        areaSalvosD.setBounds(150, 210, 440, 250);
        areaSalvosD.setEditable(false);

        botaoMenuD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.setContentPane(painelMenu);

                janela.revalidate();
                janela.repaint();
            }
        });

        botaoAdicionarD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNomeD.getText();
                labelResultadoD.setText("Salvo: " + nome);

                if (!nome.isEmpty()) {
                    areaSalvosD.append("Disciplina Salva: " + nome + "\n");
                    campoNomeD.setText("");
                }
            }
        });

        painelDiciplna.add(botaoMenuD);
        painelDiciplna.add(tituloD);
        painelDiciplna.add(labelNomeD);
        painelDiciplna.add(campoNomeD);
        painelDiciplna.add(botaoAdicionarD);
        painelDiciplna.add(labelResultadoD);
        painelDiciplna.add(areaSalvosD);

        painelDiciplna.setSize(800, 800);
        painelDiciplna.setLayout(null);
        painelDiciplna.setVisible(true);

        // Adições do painelNota
        JButton botaoMenuN = new JButton("Menu");
        botaoMenuN.setBounds(20, 20, 100, 30);

        JLabel tituloN = new JLabel("Lançar Nota");
        tituloN.setBounds(280, 30, 300, 50);
        tituloN.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel labelNomeNota = new JLabel("Nome do aluno:");
        labelNomeNota.setBounds(150, 120, 120, 30);

        JTextField campoNomeNota = new JTextField();
        campoNomeNota.setBounds(270, 120, 200, 30);

        JLabel labelNota1 = new JLabel("Nota 1:");
        labelNota1.setBounds(150, 170, 100, 30);

        JTextField campoNota1 = new JTextField();
        campoNota1.setBounds(270, 170, 200, 30);

        JLabel labelNota2 = new JLabel("Nota 2:");
        labelNota2.setBounds(150, 220, 100, 30);

        JTextField campoNota2 = new JTextField();
        campoNota2.setBounds(270, 220, 200, 30);

        JButton botaoAdicionarN = new JButton("Adicionar");
        botaoAdicionarN.setBounds(490, 170, 120, 30);

        JLabel labelResultadoN = new JLabel("");
        labelResultadoN.setBounds(150, 270, 400, 30);

        JTextArea areaSalvosN = new JTextArea();
        areaSalvosN.setBounds(150, 320, 440, 200);
        areaSalvosN.setEditable(false);

        botaoMenuN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.setContentPane(painelMenu);

                janela.revalidate();
                janela.repaint();
            }
        });

        botaoAdicionarN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double nota1 = Double.parseDouble(campoNota1.getText());
                double nota2 = Double.parseDouble(campoNota2.getText());

                double media = (nota1 + nota2) / 2;

                areaSalvosN.append(
                        campoNomeNota.getText() + " - Média " + media + "\n");
            }
        });

        painelNota.add(botaoMenuN);
        painelNota.add(tituloN);
        painelNota.add(labelNomeNota);
        painelNota.add(campoNomeNota);
        painelNota.add(botaoAdicionarN);
        painelNota.add(labelResultadoN);
        painelNota.add(areaSalvosN);
        painelNota.add(labelNota1);
        painelNota.add(campoNota1);
        painelNota.add(labelNota2);
        painelNota.add(campoNota2);

        painelNota.setSize(800, 800);
        painelNota.setLayout(null);
        painelNota.setVisible(true);

    }
}
