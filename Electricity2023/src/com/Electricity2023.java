package com;

public class Electricity2023 {
    private double elc; // 輸入度數
    private double storeSummer; // 營業夏季
    private double peopleSummer; // 非營業夏季
    private double peopleWinter; // 非營業非夏季
    private double storeWinter; // 營業非夏季
    private String name="";
    private int money;
    
    public Electricity2023(String name, double elc, int money) {
    	super();
    	this.name = name;
        this.elc = elc;
        this.money = money;
    }

   public void change(int money, double storeSummer) {
	   
	   
   }

	// 營業夏季
    public void calStoreSummer() {
        if (elc <= 330) {
            storeSummer = elc * 2.53;
        } else {
            storeSummer += 330 * 2.53;
            if (elc <= 700) {
                storeSummer += (elc - 330) * 3.55;
            } else {
                storeSummer += (700 - 330) * 3.55;
                if (elc <= 1500) {
                    storeSummer += (elc - 700) * 4.25;
                } else {
                    storeSummer += (1500 - 700) * 4.25;
                    if (elc <= 3000) {
                        storeSummer += (elc - 1500) * 6.62;
                    } else {
                        storeSummer += (3000 - 1500) * 6.62;
                        storeSummer += (elc - 3000) * 6.75;
                    }
                }
            }
        }
    }

    public void calPeopleSummer() {
        // 非營業夏季計算
        if (elc <= 120) {
            peopleSummer = elc * 1.63;
        } else {
            peopleSummer += 120 * 1.63;
            if (elc <= 330) {
                peopleSummer += (elc - 120) * 2.38;
            } else {
                peopleSummer += (330 - 120) * 2.38;
                if (elc <= 500) {
                    peopleSummer += (elc - 330) * 3.52;
                } else {
                    peopleSummer += (500 - 330) * 3.52;
                    if (elc <= 700) {
                        peopleSummer += (elc - 500) * 4.8;
                    } else {
                        peopleSummer += (700 - 500) * 4.8;
                        if (elc <= 1000) {
                            peopleSummer += (elc - 700) * 5.83;
                        } else {
                            peopleSummer += (1000 - 700) * 5.83;
                            peopleSummer += (elc - 1000) * 7.69;
                        }
                    }
                }
            }
        }
    }

    // 非營業非夏季
    public void calPeopleWinter() {
        if (elc <= 120) {
            peopleWinter = elc * 1.63;
        } else {
            peopleWinter += 120 * 1.63;
            if (elc <= 330) {
                peopleWinter += (elc - 120) * 2.1;
            } else {
                peopleWinter += (330 - 120) * 2.1;
                if (elc <= 500) {
                    peopleWinter += (elc - 330) * 2.89;
                } else {
                    peopleWinter += (500 - 330) * 2.89;
                    if (elc <= 700) {
                        peopleWinter += (elc - 500) * 3.94;
                    } else {
                        peopleWinter += (700 - 500) * 3.94;
                        if (elc <= 1000) {
                            peopleWinter += (elc - 700) * 4.47;
                        } else {
                            peopleWinter += (1000 - 700) * 4.47;
                            peopleWinter += (elc - 1000) * 6.03;
                        }
                    }
                }
            }
        }
    }
    
    
    
    
    
    
    public void calStoreWinter() {
        // 營業非夏季計算
        if (elc <= 330) {
            storeWinter = elc * 2.12;
        } else {
            storeWinter += 330 * 2.12;
            if (elc <= 700) {
                storeWinter += (elc - 330) * 2.91;
            } else {
                storeWinter += (700 - 330) * 2.91;
                if (elc <= 1500) {
                    storeWinter += (elc - 700) * 3.44;
                } else {
                    storeWinter += (1500 - 700) * 3.44;
                    if (elc <= 3000) {
                        storeWinter += (elc - 1500) * 5.2;
                    } else {
                        storeWinter += (3000 - 1500) * 5.2;
                        storeWinter += (elc - 3000) * 5.3;
                    }
                }
            }
        }
    }

    public double getStoreSummer() {
        return storeSummer;
    }

    public double getPeopleSummer() {
        return peopleSummer;
    }

    public double getPeopleWinter() {
        return peopleWinter;
    }

    public double getStoreWinter() {
        return storeWinter;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}
}
