package Search;

import Base.CommonApi;

public class SearchPage extends CommonApi {
    public void searchMenu(){
        //  typeOnElementNEnter("#twotabsearchtextbox","books");
        typeOnElement("body","Den of Thieves");
        navigateBack();
        clickOnSearch();
        //  typeOnElementNEnter("body","Cell");
        //  navigateBack();
        //  typeOnElementNEnter("body","Homeland");
        //  navigateBack();
        // typeOnElementNEnter("body","The Informant");
        // navigateBack();
        // clearField("body");
    }

}