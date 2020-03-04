public class HelloWorld {
    
    public static void vulnerablecode(){
    StringBuilder query = new StringBuilder();
query.append( "select * from user u where u.name in (" + namesString + ")" );
try {
	Connection connection = getConnection();
    Statement statement = connection.createStatement();
    resultSet = statement.executeQuery(query.toString());
}
    }
	public void setValues(String[] somevalues) {
        this.values = somevalues;
}
	public void setValues2(String[] somevalues) {
        this.values = somevalues;
}
	public void devideBy0(int num) {
        int newNum = num/0;
}
	
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

}
