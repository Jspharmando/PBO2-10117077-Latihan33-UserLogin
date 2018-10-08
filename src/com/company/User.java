package com.company;

/**
 * @author
 * Nama : Joseph Armando Carvallo
 * NIM  : 10117077
 **/

public class User {
    private final String username = "RizkyAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;

    private boolean cekAkun(String parUserName, String parPassword){
        statusAkun = false;
        if (parUserName.equals(username) && parPassword.equals(password))
            statusAkun = true;
        return statusAkun;
    }
    private void hasilLogin(boolean status, String parUserName){
        this.cekAkun(parUserName, password);
        status=this.statusAkun;
        if(status==true){
            System.out.println("*******HALLO "+parUserName.toUpperCase()+" ******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else{
            System.out.println("Ooopppsss, Username atau Password salah");
        }

    }
    public void pengecekanLogin(String parUserName, String parPassword){
        this.cekAkun(parUserName, parPassword);
        this.hasilLogin(statusAkun, parUserName);

    }
}
