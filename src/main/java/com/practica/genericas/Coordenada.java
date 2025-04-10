package com.practica.genericas;


public class Coordenada {
	private float latitud;
	private float longitud;

	
	public Coordenada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coordenada(float latitud, float longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public float getLatitud() {
		return latitud;
	}

	public float getLongitud() {
		return longitud;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(latitud);
		result = prime * result + Float.floatToIntBits(longitud);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
        return comprobarEquals(latitud, other.latitud) && comprobarEquals(longitud, other.longitud);
    }

	private boolean comprobarEquals(float a, float b){
		return (Float.floatToIntBits(a) == Float.floatToIntBits(b));
	}

	
}
