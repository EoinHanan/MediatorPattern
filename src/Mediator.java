/**
 * Created by EoinH on 04/10/2017.
 */
public interface Mediator {

        public void saleOffer(String stock, int shares, int collCode);

        public void buyOffer(String stock, int shares, int collCode);

        public void addColleague(Colleague colleague);

}
