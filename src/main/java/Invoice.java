public class Invoice {
    /*
        creamos las variables de la clase Invoice y los metodos getter and setter
         */
   public boolean value;
   private int code;
   protected int id;

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
