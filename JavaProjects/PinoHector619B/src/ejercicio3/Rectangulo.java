package ejercicio3;

class Rectangulo {
	int x1;
	int x2;
	int y1;
	int y2;
		
    Rectangulo(int x1, int x2, int y1, int y2) {
        if (x1 >= x2 || y1 >= y2) {
            throw new IllegalArgumentException("Las coordenadas no son válidas: (x1, y1) debe ser la esquina inferior izquierda y (x2, y2) la esquina superior derecha.");
        }
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
	}
}
