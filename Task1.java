public class Task1{
	public static void main(String args[]){
	int m=5,n=97;
		for(int i=0; i < 5; i++){
		    for(int k=m; k > 0 ; k--){
				System.out.print(" ");
			}
			for(int j=0; j < i ; j++){
			    char c=(char)n;
				System.out.print(c + "" + i + " ");
				n++;
			}
				System.out.println("");
				m--;
		}
	}
}