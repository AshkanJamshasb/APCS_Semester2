public class Data {
    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        if (objects.length > 0) {
            return sum/objects.length;
        } else {
            return 0;
        }
    }

	public static Measurable max (Measurable[] objects) {
		Measurable max = new BankAccount("Victoria", 0);
		for (Measurable e : objects) {
			if(max.getMeasure() < e.getMeasure()) {
				max	= e;
			 }
	  	}
		return max;
	}
}