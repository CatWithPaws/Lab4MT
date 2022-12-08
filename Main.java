import com.mysql.cj.log.Log;

public class Main {

    private static TicTacToePlayer PlayerX;
    
    private static TicTacToePlayer PlayerO;

    private static Db db;

    private static String activeUser1;
    private static String activeUser2;

    public static void main(String[] args) {
        LogIn();
        System.console().readLine("exit - Выйти");
       
    }

    public static void LogIn(){
    db = new Db();
    String username1;
    String password1;
    do{
        username1 = System.console().readLine("Для игры необходимо зайти в аккаунт в два аккаунта, введите логин для первого аккаунта ");
        
        password1 = System.console().readLine("Введите пароль ");
    }
    while(!db.LoginUser(username1, password1));
    activeUser1 = username1;
    String username2;
    String password2;
       

    do{
        username2 = System.console().readLine("Для игры необходимо зайти в аккаунт в два аккаунта, введите логин для второго аккаунта ");
        
        password2 = System.console().readLine("Введите пароль ");
    }
    while(!db.LoginUser(username2, password2));
    activeUser2 = username2;
    PlayerX = new TicTacToePlayer(Role.X,username1);
    PlayerO = new TicTacToePlayer(Role.O, username2);
    }
}



