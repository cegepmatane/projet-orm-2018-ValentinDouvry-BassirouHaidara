package ca.qc.cgmatane.informatique.exoplaneteAdmin.modele;

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
	 
	 public Exoplanete() {
		 super();
		 this.planete = "";
		 this.etoile = "";
		 this.typeEtoile="";
		 this.masse="";
		 this.masse="";
		 this.rayon="";
		 this.flux="";
		 this.temperature="";
		 this.periode="";
		 this.distance="";
		 this.zone="";
		 this.ist=0;
		 this.sph=0;
		 this.hzd="";
		 this.hzc="";
		 this.hza="";
		 this.pClasse="";
		 this.hclasse="";
		 this.phi=0;
		 this.distance2 ="";
		 this.status="";
		 this.decouverte="";
		 
		
	}
	 
	 public Exoplanete(String planete, String etoile, String typeEtoile, String masse, String rayon, String flux,
				String temperature, String periode, String distance, String zone, float ist, float sph, String hzd,
				String hzc, String hza, String pClasse, String hclasse, float phi, String distance2, String status,
				String decouverte) {
			super();
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

	public void setPlanete(String planete) {
		this.planete = planete;
	}

	public String getEtoile() {
		return etoile;
	}

	public void setEtoile(String etoile) {
		this.etoile = etoile;
	}

	public String getTypeEtoile() {
		return typeEtoile;
	}

	public void setTypeEtoile(String typeEtoile) {
		this.typeEtoile = typeEtoile;
	}

	public String getMasse() {
		return masse;
	}

	public void setMasse(String masse) {
		this.masse = masse;
	}

	public String getRayon() {
		return rayon;
	}

	public void setRayon(String rayon) {
		this.rayon = rayon;
	}

	public String getFlux() {
		return flux;
	}

	public void setFlux(String flux) {
		this.flux = flux;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public float getIst() {
		return ist;
	}

	public void setIst(float ist) {
		this.ist = ist;
	}

	public float getSph() {
		return sph;
	}

	public void setSph(float sph) {
		this.sph = sph;
	}

	public String getHzd() {
		return hzd;
	}

	public void setHzd(String hzd) {
		this.hzd = hzd;
	}

	public String getHzc() {
		return hzc;
	}

	public void setHzc(String hzc) {
		this.hzc = hzc;
	}

	public String getHza() {
		return hza;
	}

	public void setHza(String hza) {
		this.hza = hza;
	}

	public String getpClasse() {
		return pClasse;
	}

	public void setpClasse(String pClasse) {
		this.pClasse = pClasse;
	}

	public String gethClasse() {
		return hclasse;
	}

	public void sethClasse(String hclasse) {
		this.hclasse = hclasse;
	}

	public float getPhi() {
		return phi;
	}

	public void setPhi(float phi) {
		this.phi = phi;
	}

	public String getDistance2() {
		return distance2;
	}

	public void setDistance2(String distance2) {
		this.distance2 = distance2;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDecouverte() {
		return decouverte;
	}

	public void setDecouverte(String decouverte) {
		this.decouverte = decouverte;
	}
	
	 
	 
	 
	 

}
