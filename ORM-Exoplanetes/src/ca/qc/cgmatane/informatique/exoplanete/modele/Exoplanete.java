package ca.qc.cgmatane.informatique.exoplanete.modele;

public class Exoplanete {
	
	 private String planete;
	 private String etoile;
	 private String typeEtoile;
	 private String masse;
	 private String rayon;
	 private String flux;
	 private String temperature;
	 private String periode;
	 private String distance;
	 private String zone;
	 private float ist;
	 private float sph;
	 private String hzd;
	 private String hzc;
	 private String hza;
	 private String pClasse;
	 private String hclasse;
	 private float phi;
	 private String distance2;
	 private String status;
	 private String decouverte;
	 
	 public Exoplanete(String planete, String etoile, String typeEtoile, String masse, String rayon, String flux,
			String temperature, String periode, String distance, String zone, float ist, float sph, String hzd,
			String hzc, String hza, String pClasse, String hclasse, float phi, String distance2, String status,
			String decouverte) {

		this.planete = planete;
		this.etoile = etoile;
		this.typeEtoile = typeEtoile;
		this.masse = masse;
		this.rayon = rayon;
		this.flux = flux;
		this.temperature = temperature;
		this.periode = periode;
		this.distance = distance;
		this.zone = zone;
		this.ist = ist;
		this.sph = sph;
		this.hzd = hzd;
		this.hzc = hzc;
		this.hza = hza;
		this.pClasse = pClasse;
		this.hclasse = hclasse;
		this.phi = phi;
		this.distance2 = distance2;
		this.status = status;
		this.decouverte = decouverte;
	}
	public String getPlanete() {
		return planete;
	}
	public String getEtoile() {
		return etoile;
	}
	public String getTypeEtoile() {
		return typeEtoile;
	}
	public String getMasse() {
		return masse;
	}
	public String getRayon() {
		return rayon;
	}
	public String getFlux() {
		return flux;
	}
	public String getTemperature() {
		return temperature;
	}
	public String getPeriode() {
		return periode;
	}
	public String getDistance() {
		return distance;
	}
	public String getZone() {
		return zone;
	}
	public float getIst() {
		return ist;
	}
	public float getSph() {
		return sph;
	}
	public String getHzd() {
		return hzd;
	}
	public String getHzc() {
		return hzc;
	}
	public String getHza() {
		return hza;
	}
	public String getpClasse() {
		return pClasse;
	}
	public String getHclasse() {
		return hclasse;
	}
	public float getPhi() {
		return phi;
	}
	public String getDistance2() {
		return distance2;
	}
	public String getStatus() {
		return status;
	}
	public String getDecouverte() {
		return decouverte;
	}
	 
	 
	 
	 

}
