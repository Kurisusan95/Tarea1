
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		return x + y;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		return x - y;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		return x * y;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		return x % y;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{
            return x%2==0;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
            return x%3==0;
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
            if(x>y){
                return x;
            }else{
                return y;
            }
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
            return edad>=18;
        }
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
            return x % 2 == 0 && y % 2 == 0 && z % 2 == 0;
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		if(x>y && x>z){
                    return x;
                }else if(y>x && y>z){
                    return y;
                }else if(z>x && z>y){
                    return z;
                }
            return 0;
	}
	
	public static void main(String[] args)
	{
            System.out.println(sumar(10,5));
            System.out.println(restar(10,5));
            System.out.println(multiplicar(2,2));
            System.out.println(residuo(10,5));
            System.out.println(esPar(80));
            System.out.println(esMultiploDe3(81));
            System.out.println(getMayor(12,10));
            System.out.println(esMayorDeEdad(21));
            System.out.println(sonPares(10, 12, 20));
            System.out.println(getMayorDe3(5, 20, 81));
	}

}
