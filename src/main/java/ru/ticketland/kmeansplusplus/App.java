package ru.ticketland.kmeansplusplus;


import org.apache.commons.math3.ml.clustering.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {


        // исходный массив агентов
        List<Agent> agentList = new ArrayList<>();
        int clusterSize = 3;

        //список агентов
        agentList.add(new Agent(new double[] {1,1}));
        agentList.add(new Agent(new double[] {1,2}));
        agentList.add(new Agent(new double[] {2,1}));
        agentList.add(new Agent(new double[] {2,2}));
        agentList.add(new Agent(new double[] {3,1}));
        agentList.add(new Agent(new double[] {3,2}));
        agentList.add(new Agent(new double[] {3,3}));



        //множество кластеров
        List<CentroidCluster<Agent>> list = new ArrayList<>();
        List<CentroidCluster<Agent>> list2 = new ArrayList<>();



        KMeansPlusPlusClusterer<Agent> kMeansPlusPlusClusterer =
                new KMeansPlusPlusClusterer<>(clusterSize);

        FuzzyKMeansClusterer<Agent> fuzzyKMeansClusterer =
                new FuzzyKMeansClusterer<>(clusterSize, 2);


        list = kMeansPlusPlusClusterer.cluster(agentList);
        list2 = fuzzyKMeansClusterer.cluster(agentList);


        System.out.println("-------------k-means++----------------");
        for (CentroidCluster<Agent> a : list) {
            System.out.println(a.getPoints());
        }


        System.out.println("-------------c-means----------------");
        for (CentroidCluster<Agent> a : list2) {
            System.out.println(a.getPoints());
        }




    }
}
