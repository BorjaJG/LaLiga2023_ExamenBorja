package com.iesam.laliga2023.data;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.laliga2023.domain.Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DemoDataRepository implements DemoRepository {

    //Nota, crear este objeto como Singleton
    private DemoLocalDataSource localDataSource;

    @Override
    public Demo get(Integer demoId) {
        return localDataSource.findById(demoId);
    }

    @Override
    public void save(Demo demo) {
        localDataSource.save(demo);
    }
}
