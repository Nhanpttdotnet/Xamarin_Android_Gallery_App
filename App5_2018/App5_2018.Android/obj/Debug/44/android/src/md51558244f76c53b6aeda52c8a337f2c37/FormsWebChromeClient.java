package md51558244f76c53b6aeda52c8a337f2c37;


public class FormsWebChromeClient
	extends android.webkit.WebChromeClient
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Xamarin.Forms.Platform.Android.FormsWebChromeClient, Xamarin.Forms.Platform.Android", FormsWebChromeClient.class, __md_methods);
	}


	public FormsWebChromeClient ()
	{
		super ();
		if (getClass () == FormsWebChromeClient.class)
			mono.android.TypeManager.Activate ("Xamarin.Forms.Platform.Android.FormsWebChromeClient, Xamarin.Forms.Platform.Android", "", this, new java.lang.Object[] {  });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
