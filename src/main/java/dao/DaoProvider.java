package dao;

import models.Kadra;
import models.OnlineManager;

import java.util.ArrayList;
import java.util.List;

public class DaoProvider implements DaoInterface{

    @Override
    public List<Kadra> getLechList() {
        List<Kadra> result = new ArrayList<>();
        try {
            result = OnlineManager.getLechWiosnaList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
