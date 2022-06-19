package model;

public class Usuario {

    //atributos
    private String login;
    private String senha;

    //constutor
    public Usuario (String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

        //get e set
        public String getLogin() {
            return this.login;
        }
        public void setLogin (String login){
            this.login = login;
        }

        public String getSenha(){
            return this.senha;
        }
        public void setSenha (String senha){
            this.senha = senha;
        }


        //metodo para logar
        public boolean logar (String login, String senha) {
        return true;

    }



    // metodo para deslogar





}
