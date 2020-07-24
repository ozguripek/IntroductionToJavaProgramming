package chapter01;

public class Exercise01_11 {

	public static void main(String[] args) {
		// 31536000 seconds per year
		// Current population: 312,032,486
		// One birth every 7 seconds
        // One death every 13 seconds
		// One new immigrant every 45 seconds
		
		//Current population + (((births per year)
		//		                -(deaths per year)
		//		                +(new immigrants per year))
		//		                 * year))
		
		
		
		System.out.println("Year 1 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
				                      - (31536000 / 13)
				                      + (31536000 / 45)) 
				                                    * 1));
		
       System.out.println("Year 2 projection: ");
       System.out.println(312032486 + (((31536000 / 7)
                                     - (31536000 / 13)
                                     + (31536000 / 45)) 
                                                   * 2));
       
       System.out.println("Year 3 projection: ");
       System.out.println(312032486 + (((31536000 / 7)
    		                         - (31536000 / 13)
                                     + (31536000 / 45)) 
                                                  * 3));

       
       System.out.println("Year 4 projection: ");
       System.out.println(312032486 + (((31536000 / 7)
    		                          - (31536000 / 13)
                                      + (31536000 / 45)) 
                                                    * 4));

       
       System.out.println("Year 5 projection: ");
       System.out.println(312032486 + (((31536000 / 7)
    		                          - (31536000 / 13)
                                      + (31536000 / 45)) 
                                                    * 5));

	}

}
