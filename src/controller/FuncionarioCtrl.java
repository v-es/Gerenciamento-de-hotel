package controller;

import entity.Funcionario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioCtrl {
    List<Funcionario> funcionarios = new ArrayList<>();

    public FuncionarioCtrl() {

    }

    public void insert(Funcionario f) {
        if (f.getNome().isEmpty()){
            msgError("Nome vazio");
            return ;
        }
        if (f.getCelular().isEmpty()){
            msgError("Celular vazio");
            return ;
        }
        if (f.getCpf().isEmpty()){
            msgError("Cpf vazio");
            return;
        }
        if (f.getEmail().isEmpty()){
            msgError("Email vazio");
            return;
        }
        if (f.getEndereco() == null){
            msgError("Endereco vazio");
            return;
        }
        if (f.getTelefone().isEmpty()){
            msgError("Telefone vazio");
            return;
        }
        if (f.getId() ==  0){
            msgError("Id vazio");
            return;
        }
        if (f.getTipoFuncionario() == null){
            msgError("Tipo funcionario vazio");
            return;
        }
        if (f.getLogin().isEmpty()){
            msgError("Login vazio");
            return;
        }
        if (f.getSenha().isEmpty()){
            msgError("Senha vazio");
            return;
        }
        this.funcionarios.add(f);
    }

    private void msgError(String corpo){
        JOptionPane.showMessageDialog(null, corpo, "ERRO",JOptionPane.ERROR_MESSAGE);
    }

    public Funcionario selectDocumento(String doc) {
        for (Funcionario f : this.funcionarios) {
            if (f.getCpf().contains(doc)) {
                return f;
            }
        }
        return null;
    }
}