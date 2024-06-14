package com.hcltech.Assi5Assi6;
	class Fish extends Animal implements Pat {
	    private String name;

	    public Fish() {
	        super(0);
	    }

	    @Override
	    public String getName() {
	        return name;
	    }

	    @Override
	    public void setName(String name) {
	        this.name = name;
	    }

	    @Override
	    public void play() {
	        System.out.println(name + " is playing.");
	    }

	    @Override
	    public void walk() {
	        System.out.println("Fish don't walk, they swim.");
	    }

	    @Override
	    public void eat() {
	        System.out.println("Fish eats algae.");
	    }
	}

	

