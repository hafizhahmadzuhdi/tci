public interface BasicStatisticInterface {

    /**
     * @param valueToAdd value which will be added.
     */
    void addDoubletoData(Double valueToAdd);


    /**
     * clear all data items
     */
    void clearData();


    /**
     * this method returns the number of data items.
     *
     * @return number of data items.
     */
    int numberOfDataItems();

    /**
     * this method returns the sum of all collected data items
     *
     * @return the sum of the data items, or 0 when no data items are present
     */
    Double sum();


    /**
     * this method returns another basic statisctic function which is mean
     *
     * @return the mean of the bunch of array of items
     */
    Double mean();

    /**
     * this method returns another basic statisctic function which is max
     *
     * @return the highest number of an array
     */
    Double max();

    /**
     * this method returns another basic statisctic function which is median
     *
     * @return the middle numbers of value of an array
     */
    Double median();

}
