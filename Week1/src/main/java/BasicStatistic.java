import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicStatistic implements BasicStatisticInterface{

    List<Double> myArrayList = new ArrayList<Double>();


    public BasicStatistic() {
    }

    @Override
    public void addDoubletoData(Double valueToAdd) {
        myArrayList.add(valueToAdd);
    }

    @Override
    public void clearData() {
        myArrayList.clear();
    }

    @Override
    public int numberOfDataItems() {
        int rv = myArrayList.size();
        return rv;
    }

    @Override
    public Double sum() {
        double rv=0.0;
        if(myArrayList.size()==0) {
            rv = 0.0;
        } else{
            for(int i=0; i<myArrayList.size(); i++){
                rv+=myArrayList.get(i);
            }
        }
        return rv;
    }

    //Additional Methods initiated by me

    @Override
    public Double mean() {
        double result = 0;
        for(int i =0; i<myArrayList.size(); i++){
            result+=myArrayList.get(i);
        }

        double finalresult = Math.round((result/myArrayList.size())*100d)/100d;
        return finalresult;
    }

    @Override
    public Double max(){
        Collections.sort(myArrayList);
        return myArrayList.get(myArrayList.size()-1);
    }

    public Double median(){
        int check = myArrayList.size()%2;
        List<Double> secondArrayList = new ArrayList<Double>();
        double result = 0;

        if(check == 0){
            int x = myArrayList.size()/2;
            Collections.sort(myArrayList);
            result = Math.round(((myArrayList.get(x-1) + myArrayList.get(x))/2)*100d)/100d;
        } else {
            //odd numbers
            int x = (myArrayList.size()/2) +1;
            Collections.sort(myArrayList);
            result = myArrayList.get(x-1);
        }
        return result;
    }

}
