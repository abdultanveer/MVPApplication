package fragments.rjt.com.mvpapplication;

public class Presenter implements IPresenter {
    IView view;

  public  Presenter(MainActivity mainActivity){
      view = mainActivity;

  }

    @Override
    public void onButtonClicked() {
        view.showToast();
    }
}
