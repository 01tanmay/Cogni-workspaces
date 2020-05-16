package prc03;
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
//
//                    Source Code Generated by
//                           CA Gen 8.6
//
//    Copyright (c) 2020 CA Technologies. All rights reserved.
//
//    Name: B25EX710_IA                      Date: 2020/03/11
//    User: YWH0NKF                          Time: 16:48:33
//
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
// Import Statements
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;
import java.sql.*;
import com.ca.gen.vwrt.*;
import com.ca.gen.vwrt.types.*;
import com.ca.gen.vwrt.vdf.*;
import com.ca.gen.csu.exception.*;

// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
// START OF IMPORT VIEW
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
/**
 * Internal data view storage for: B25EX710_IA
 **/
public class B25EX710_IA extends ViewBase implements IImportView, Serializable
{
  // Entity View: IMP
  //        Type: EWW_SUPPLIED
  /**
   * Attribute missing flag for: ImpEwwSuppliedEvaluationDate
   **/
  public char ImpEwwSuppliedEvaluationDate_AS;
  /**
   * Attribute for: ImpEwwSuppliedEvaluationDate
   * Domain: Date
   * Length: 8
   **/
  public int ImpEwwSuppliedEvaluationDate;
  // Entity View: IMP_FILTER
  //        Type: ICH1_CHARGE_BASE
  /**
   * Attribute missing flag for: ImpFilterIch1ChargeBaseBaseCode
   **/
  public char ImpFilterIch1ChargeBaseBaseCode_AS;
  /**
   * Attribute for: ImpFilterIch1ChargeBaseBaseCode
   * Domain: Text
   * Length: 6
   * Varying Length: N
   **/
  public String ImpFilterIch1ChargeBaseBaseCode;
  /**
   * Attribute missing flag for: ImpFilterIch1ChargeBaseOriginCountryCode
   **/
  public char ImpFilterIch1ChargeBaseOriginCountryCode_AS;
  /**
   * Attribute for: ImpFilterIch1ChargeBaseOriginCountryCode
   * Domain: Text
   * Length: 3
   * Varying Length: N
   **/
  public String ImpFilterIch1ChargeBaseOriginCountryCode;
  /**
   * Attribute missing flag for: ImpFilterIch1ChargeBaseDestinationCountryCode
   **/
  public char ImpFilterIch1ChargeBaseDestinationCountryCode_AS;
  /**
   * Attribute for: ImpFilterIch1ChargeBaseDestinationCountryCode
   * Domain: Text
   * Length: 3
   * Varying Length: N
   **/
  public String ImpFilterIch1ChargeBaseDestinationCountryCode;
  // Entity View: IMP_NEXT_KEY
  //        Type: ICH1_CHARGE_BASE
  /**
   * Attribute missing flag for: ImpNextKeyIch1ChargeBaseInstanceId
   **/
  public char ImpNextKeyIch1ChargeBaseInstanceId_AS;
  /**
   * Attribute for: ImpNextKeyIch1ChargeBaseInstanceId
   * Domain: Number
   * Length: 15
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public double ImpNextKeyIch1ChargeBaseInstanceId;
  /**
   * Attribute missing flag for: ImpNextKeyIch1ChargeBaseChargeCode
   **/
  public char ImpNextKeyIch1ChargeBaseChargeCode_AS;
  /**
   * Attribute for: ImpNextKeyIch1ChargeBaseChargeCode
   * Domain: Text
   * Length: 6
   * Varying Length: N
   **/
  public String ImpNextKeyIch1ChargeBaseChargeCode;
  /**
   * Default Constructor
   **/
  
  public B25EX710_IA()
  {
    reset();
  }
  /**
   * Copy Constructor
   **/
  
  public B25EX710_IA(B25EX710_IA orig)
  {
    copyFrom(orig);
  }
  /**
   * Static instance creator function
   **/
  
  public static B25EX710_IA getInstance()
  {
    return new B25EX710_IA();
  }
  /**
   * Static free instance method
   **/
  
  public void freeInstance()
  {
  }
  /**
   * clone constructor
   **/
  
  @Override public Object clone()
  	throws CloneNotSupportedException
  {
    return(new B25EX710_IA(this));
  }
  /**
   * Resets all properties to the defaults.
   **/
  
  public void reset()
  {
    ImpEwwSuppliedEvaluationDate_AS = ' ';
    ImpEwwSuppliedEvaluationDate = 00000000;
    ImpFilterIch1ChargeBaseBaseCode_AS = ' ';
    ImpFilterIch1ChargeBaseBaseCode = "      ";
    ImpFilterIch1ChargeBaseOriginCountryCode_AS = ' ';
    ImpFilterIch1ChargeBaseOriginCountryCode = "   ";
    ImpFilterIch1ChargeBaseDestinationCountryCode_AS = ' ';
    ImpFilterIch1ChargeBaseDestinationCountryCode = "   ";
    ImpNextKeyIch1ChargeBaseInstanceId_AS = ' ';
    ImpNextKeyIch1ChargeBaseInstanceId = 0.0;
    ImpNextKeyIch1ChargeBaseChargeCode_AS = ' ';
    ImpNextKeyIch1ChargeBaseChargeCode = "      ";
  }
  /**
   * Gets the VDF version of the current state of the instance.
   **/
  public VDF getVDF()
  {
    throw new RuntimeException("can only execute getVDF for a Procedure Step.");
  }
  
  /**
   * Sets the current state of the instance to the VDF version.
   **/
  public void setFromVDF(VDF vdf)
  {
    throw new RuntimeException("can only execute setFromVDF for a Procedure Step.");
  }
  
  /**
   * Sets the current instance based on the passed view.
   **/
  public void copyFrom(IImportView orig)
  {
    this.copyFrom((B25EX710_IA) orig);
  }
  
  /**
   * Sets the current instance based on the passed view.
   **/
  public void copyFrom(B25EX710_IA orig)
  {
    ImpEwwSuppliedEvaluationDate_AS = orig.ImpEwwSuppliedEvaluationDate_AS;
    ImpEwwSuppliedEvaluationDate = orig.ImpEwwSuppliedEvaluationDate;
    ImpFilterIch1ChargeBaseBaseCode_AS = orig.ImpFilterIch1ChargeBaseBaseCode_AS;
    ImpFilterIch1ChargeBaseBaseCode = orig.ImpFilterIch1ChargeBaseBaseCode;
    ImpFilterIch1ChargeBaseOriginCountryCode_AS = orig.ImpFilterIch1ChargeBaseOriginCountryCode_AS;
    ImpFilterIch1ChargeBaseOriginCountryCode = orig.ImpFilterIch1ChargeBaseOriginCountryCode;
    ImpFilterIch1ChargeBaseDestinationCountryCode_AS = orig.ImpFilterIch1ChargeBaseDestinationCountryCode_AS;
    ImpFilterIch1ChargeBaseDestinationCountryCode = orig.ImpFilterIch1ChargeBaseDestinationCountryCode;
    ImpNextKeyIch1ChargeBaseInstanceId_AS = orig.ImpNextKeyIch1ChargeBaseInstanceId_AS;
    ImpNextKeyIch1ChargeBaseInstanceId = orig.ImpNextKeyIch1ChargeBaseInstanceId;
    ImpNextKeyIch1ChargeBaseChargeCode_AS = orig.ImpNextKeyIch1ChargeBaseChargeCode_AS;
    ImpNextKeyIch1ChargeBaseChargeCode = orig.ImpNextKeyIch1ChargeBaseChargeCode;
  }
}
