public class Relogio{

        private int segundos;

        public Relogio(int hora, int minuto, int segundo){
            setHora(hora);
            setMinuto(minuto);
            setSegundo(segundo);
        }

        public void setHora(int hora){
            int horaSegundo = (hora >= 0 && hora <=23 ? hora : 0);
            this.segundos += ((horaSegundo - getHora())*3600);
        }

        public int getHora(){
            int horaSegundo = (segundos/3600);
            return horaSegundo;
        }

        public void setMinuto(int minuto) {
            int minutoSegundo = (minuto >= 0 && minuto <=59 ? minuto : 0);
            this.segundos += ((minutoSegundo - getMinuto())*60);
        }

        public int getMinuto() {
            int minutoSegundo = ((this.segundos%3600)/60);
            return minutoSegundo;
        }

        public void setSegundo(int segundo) {
            int segundoSegundo = (segundo >= 0 && segundo <= 59 ? segundo : 0);
            this.segundos += (segundoSegundo - getSegundo());
        }

        public int getSegundo() {
            int segundo = ((this.segundos%3600)%60);
            return segundo;
        }

        public String toString() {
	        return String.format("%02d:%02d:%02d",
                                getHora(),
			                    getMinuto(),
			                    getSegundo());
        }
        

}