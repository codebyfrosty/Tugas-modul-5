/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5java;

public class userService {
    private String[][] data = new String[2][3];
    private String [][]histories = new String [2][4];
    private String email, password, roles = "";
    private String email2, mapel1, mapel2, date= "";
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"bagaskelompok60@gmail.com", "12345", "supedAdmin"},
            {"hilmikelompok60@gmail.com", "12345", "user"} 
        };
        String [][] histories ={
        {"bagaskelompok60@gmail.com","Fisika Dasar","Dasar Komputer dan Pemrograman", "26-04-2020" },
        {"hilmikelompok60@gmail.com","Dasar Komputer dan Pemrograman", "Konsep Jaringan Komputer", "26-04-2020"}
    };
        this.data = data;
        this.histories = histories ; 
    }
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    mapel1 = histories[i][1];
                    mapel2 = histories[i][2];
                    date = histories[i][3];
                    roles = data[i][2];
                    return true;
                }
            }
        }
        return false;
    }   
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            System.out.println("Daftar pinjaman buku perpustakaan");
            System.out.println("1. " +mapel1);
            System.out.println("2. "+ mapel2);
            System.out.println("Tanggal Pinjaman: "+ date);                
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }
}
