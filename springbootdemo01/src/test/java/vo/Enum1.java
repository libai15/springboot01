package vo;

public enum Enum1 {
    RED("红色"),BLACK("黑色"),BLUE("蓝色");
    private String mess;

     Enum1(){

    }
     Enum1(String mess){
        this.mess = mess;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public static void main(String[] args) {
        Enum1 en = Enum1.RED;
        System.out.println(en.ordinal());
    }
}
