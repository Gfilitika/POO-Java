import java.util.List;

public class avatar {
    protected String id_avatar;
    protected Integer nbre_points;

    /**
     * constructeur
     * 
     * @param id_avatar
     * @param nbre_points
     */
    public avatar(String id_avatar, Integer nbre_points) {
        this.id_avatar = id_avatar;
        this.nbre_points = nbre_points;
    }

    /**
     * retourne l'ID Avatar
     * 
     * @return String
     */
    public String getIDavatar() {
        return this.id_avatar;
    }

    /**
     * retourne le nombre de points de l'avatar
     * 
     * @return Integer
     */
    public Integer getNbrePoints() {
        return this.nbre_points;
    }

    /**
     * modifier l'ID avatar
     * 
     * @param id_avatar
     */
    public void setIDavatar(String id_avatar) {
        this.id_avatar = id_avatar;
    }

    /**
     * modifier le nombre de points de l'avatar
     * 
     * @param nbre_points
     */
    public void setNbrepoints(Integer nbre_points) {
        this.nbre_points = nbre_points;
    }

}