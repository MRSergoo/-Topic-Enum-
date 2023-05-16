public enum Colors {
    RED(10) {
        //Override method action for each constant
        public int action(int x, int y) {
            return x + y;
        }
    },
    GREEN(3) {
        public int action(int x, int y) {
            return x - y;
        }
    },

        BLUE(4) {
            public int action(int x, int y) {
                return x * y;
            }
        };

        private int sale;

        public void setSale(int sale) {
            this.sale = sale;
        }

        public int getSale() {
            return this.sale;
        }
//only "private" access modifiers for constructors (default)

        Colors(int sale) {
            this.sale = sale;
        }
    //reduntant access modifier "private"
            private Colors() {
            }

        abstract public int action(int x, int y);

    }
