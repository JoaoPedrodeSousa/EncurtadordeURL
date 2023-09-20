package db;

public class DbException extends RuntimeException{

    private static final Long serialVersionUID = 1L;
    public DbException(String msg){
        super(msg);
    }
}
