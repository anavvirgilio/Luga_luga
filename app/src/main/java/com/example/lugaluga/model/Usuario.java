package com.example.lugaluga.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.Date;

public class Usuario implements Parcelable {

    private String nome;
    private  String cpf;
    private Date dataNasc;
    private String Cep;
    private String cidade;
    private String Uf;
    private String lagradouro;
    private  String num;
    private String complemento;
    private String bairro;
    private String email;
    private String senha;


    protected Usuario(Parcel in) {
        nome = in.readString();
        cpf = in.readString();
        Cep = in.readString();
        cidade = in.readString();
        Uf = in.readString();
        lagradouro = in.readString();
        num = in.readString();
        complemento = in.readString();
        bairro = in.readString();
        email = in.readString();
        senha = in.readString();
    }

    public static final Creator<Usuario> CREATOR = new Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel in) {
            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return Uf;
    }

    public void setUf(String uf) {
        Uf = uf;
    }

    public String getLagradouro() {
        return lagradouro;
    }

    public void setLagradouro(String lagradouro) {
        this.lagradouro = lagradouro;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String nome, String cpf, Date dataNasc, String cep, String cidade, String uf, String lagradouro, String num, String complemento, String bairro, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        Cep = cep;
        this.cidade = cidade;
        Uf = uf;
        this.lagradouro = lagradouro;
        this.num = num;
        this.complemento = complemento;
        this.bairro = bairro;
        this.email = email;
        this.senha = senha;


    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(cpf);
        dest.writeString(Cep);
        dest.writeString(cidade);
        dest.writeString(Uf);
        dest.writeString(lagradouro);
        dest.writeString(num);
        dest.writeString(complemento);
        dest.writeString(bairro);
        dest.writeString(email);
        dest.writeString(senha);
    }
}
