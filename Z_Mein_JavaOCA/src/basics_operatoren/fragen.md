# Operatoren

## logische, short circuit

	int z = 0;
	boolean result = true || ++z==3;
	System.out.println(result);
	System.out.println(z);

Was ist das Ergebnis?

- Compilerfehler
* true 0
- true 1
- false 1

## arithmetische

	int e = 12;
	System.out.println( e / 0 );

- Compilerfehler
* Exception
- Infinity
- sehr große Zahl

