package com.mycompany.requirements;

import net.thucydides.core.annotations.Feature;

/**
 * Created with IntelliJ IDEA.
 * User: dmazepa
 * Date: 01.08.12
 * Time: 13:24
 * To change this template use File | Settings | File Templates.
 */
public class Application {
    @Feature
    public class Global_Header {
        public class UsingLinks {
        }
    }

    @Feature
    public class CreateAccount {
        public class FromHomePage {
        }
    }

    @Feature
    public class Checkout {
        public class AsGuestBundleProduct {
        }
    }

    @Feature
    public class ShopFlow {
        public class RotatingCarousel {}
        public class QtyOfProductsOnCLP {}
    }
}
