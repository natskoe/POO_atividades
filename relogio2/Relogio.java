public class Relogio{

        private int hora;
        private int minuto;
        private int segundo;

        public Relogio(int hora, int minuto, int segundo){
            setHora(hora);
            setMinuto(minuto);
            setSegundo(segundo);
        }

        public void setHora(int hora){
            this.hora = (hora >= 0 && hora <=23 ? hora : 0);
        }

        public int getHora(){
            return this.hora;
        }

        public void setMinuto(int minuto) {
            this.minuto = (minuto >= 0 && minuto <= 59 ? minuto : 0);
        }

        public int getMinuto() {
            return this.minuto;
        }

        public void setSegundo(int segundo) {
            this.segundo = (segundo >= 0 && segundo <= 59 ? segundo : 0);
        }

        public int getSegundo() {
            return this.segundo;
        }

        public String toString() {
	        return String.format("%02d:%02d:%02d",
                                getHora(),
			                    getMinuto(),
			                    getSegundo());
        }
        

}