package fragments.rjt.com.mvpapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements IView{
    IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);
    }

    @Override
    public void showToast() {
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show();
    }

    public void clickHandler(View view) {
        presenter.onButtonClicked();
    }
}
