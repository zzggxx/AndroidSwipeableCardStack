package wxj.swipeablecardstack;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class CardsDataAdapter extends ArrayAdapter<String> {

    private Context mContext;

    public CardsDataAdapter(Context context) {
        super(context, R.layout.card_content);
        mContext = context;
    }

    @Override
    public View getView(int position, final View contentView, ViewGroup parent){
        TextView v = (TextView)(contentView.findViewById(R.id.content));
        v.setText(getItem(position));


        contentView.findViewById(R.id.item_work_admir_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"打赏点击",Toast.LENGTH_SHORT).show();
            }
        });

        return contentView;
    }

}

