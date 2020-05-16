package prc03;
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
//
//                    Source Code Generated by
//                           CA Gen 8.6
//
//    Copyright (c) 2020 CA Technologies. All rights reserved.
//
//    Name: B25EX710_OA                      Date: 2020/03/11
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
// START OF EXPORT VIEW
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
/**
 * Internal data view storage for: B25EX710_OA
 **/
public class B25EX710_OA extends ViewBase implements IExportView, Serializable
{
  // Entity View: EXP
  //        Type: EWW_COMPONENT
  /**
   * Attribute missing flag for: ExpEwwComponentReturnCode
   **/
  public char ExpEwwComponentReturnCode_AS;
  /**
   * Attribute for: ExpEwwComponentReturnCode
   * Domain: Number
   * Length: 5
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public int ExpEwwComponentReturnCode;
  /**
   * Attribute missing flag for: ExpEwwComponentReasonCode
   **/
  public char ExpEwwComponentReasonCode_AS;
  /**
   * Attribute for: ExpEwwComponentReasonCode
   * Domain: Number
   * Length: 5
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public int ExpEwwComponentReasonCode;
  /**
   * Attribute missing flag for: ExpEwwComponentSeverityCode
   **/
  public char ExpEwwComponentSeverityCode_AS;
  /**
   * Attribute for: ExpEwwComponentSeverityCode
   * Domain: Text
   * Length: 1
   * Varying Length: N
   **/
  public String ExpEwwComponentSeverityCode;
  /**
   * Attribute missing flag for: ExpEwwComponentRollbackIndicator
   **/
  public char ExpEwwComponentRollbackIndicator_AS;
  /**
   * Attribute for: ExpEwwComponentRollbackIndicator
   * Domain: Text
   * Length: 1
   * Varying Length: N
   **/
  public String ExpEwwComponentRollbackIndicator;
  /**
   * Attribute missing flag for: ExpEwwComponentOriginServid
   **/
  public char ExpEwwComponentOriginServid_AS;
  /**
   * Attribute for: ExpEwwComponentOriginServid
   * Domain: Number
   * Length: 15
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public double ExpEwwComponentOriginServid;
  // Entity View: EXP
  //        Type: EWW_SUPPLIED
  /**
   * Attribute missing flag for: ExpEwwSuppliedEvaluationDate
   **/
  public char ExpEwwSuppliedEvaluationDate_AS;
  /**
   * Attribute for: ExpEwwSuppliedEvaluationDate
   * Domain: Date
   * Length: 8
   **/
  public int ExpEwwSuppliedEvaluationDate;
  /**
   * Attribute missing flag for: ExpEwwSuppliedNextGroupInd
   **/
  public char ExpEwwSuppliedNextGroupInd_AS;
  /**
   * Attribute for: ExpEwwSuppliedNextGroupInd
   * Domain: Text
   * Length: 1
   * Varying Length: N
   **/
  public String ExpEwwSuppliedNextGroupInd;
  // Repeating GV:  EXP_GRP_BASE_MEMBERS
  //     Repeats: 350 times
  /**
   * Repeating group view count
   **/
  public int ExpGrpBaseMembers_MA;
  /**
   * Repeating group view occurrance array
   **/
  public char ExpGrpBaseMembers_AC[] = new char[350];
  // Entity View: EXP_GRP_BASE_MEMBER
  //        Type: ICH1_CHARGE_BASE
  /**
   * Attribute missing flag for: ExpGrpBaseMemberIch1ChargeBaseBaseCode
   **/
  public char ExpGrpBaseMemberIch1ChargeBaseBaseCode_AS[] = new char[350];
  /**
   * Attribute for: ExpGrpBaseMemberIch1ChargeBaseBaseCode
   * Domain: Text
   * Length: 6
   * Varying Length: N
   **/
  public String ExpGrpBaseMemberIch1ChargeBaseBaseCode[] = new String[350];
  /**
   * Attribute missing flag for: ExpGrpBaseMemberIch1ChargeBaseOwningChargeCode
   **/
  public char ExpGrpBaseMemberIch1ChargeBaseOwningChargeCode_AS[] = new char[350];
  /**
   * Attribute for: ExpGrpBaseMemberIch1ChargeBaseOwningChargeCode
   * Domain: Text
   * Length: 6
   * Varying Length: N
   **/
  public String ExpGrpBaseMemberIch1ChargeBaseOwningChargeCode[] = new String[350];
  /**
   * Attribute missing flag for: ExpGrpBaseMemberIch1ChargeBaseInstanceId
   **/
  public char ExpGrpBaseMemberIch1ChargeBaseInstanceId_AS[] = new char[350];
  /**
   * Attribute for: ExpGrpBaseMemberIch1ChargeBaseInstanceId
   * Domain: Number
   * Length: 15
   * Decimal Places: 0
   * Decimal Precision: N
   **/
  public double ExpGrpBaseMemberIch1ChargeBaseInstanceId[] = new double[350];
  /**
   * Attribute missing flag for: ExpGrpBaseMemberIch1ChargeBaseChargeCode
   **/
  public char ExpGrpBaseMemberIch1ChargeBaseChargeCode_AS[] = new char[350];
  /**
   * Attribute for: ExpGrpBaseMemberIch1ChargeBaseChargeCode
   * Domain: Text
   * Length: 6
   * Varying Length: N
   **/
  public String ExpGrpBaseMemberIch1ChargeBaseChargeCode[] = new String[350];
  /**
   * Attribute missing flag for: ExpGrpBaseMemberIch1ChargeBaseOriginCountryCode
   **/
  public char ExpGrpBaseMemberIch1ChargeBaseOriginCountryCode_AS[] = new char[350];
  /**
   * Attribute for: ExpGrpBaseMemberIch1ChargeBaseOriginCountryCode
   * Domain: Text
   * Length: 3
   * Varying Length: N
   **/
  public String ExpGrpBaseMemberIch1ChargeBaseOriginCountryCode[] = new String[350];
  /**
   * Attribute missing flag for: ExpGrpBaseMemberIch1ChargeBaseDestinationCountryCode
   **/
  public char ExpGrpBaseMemberIch1ChargeBaseDestinationCountryCode_AS[] = new char[350];
  /**
   * Attribute for: ExpGrpBaseMemberIch1ChargeBaseDestinationCountryCode
   * Domain: Text
   * Length: 3
   * Varying Length: N
   **/
  public String ExpGrpBaseMemberIch1ChargeBaseDestinationCountryCode[] = new String[350];
  /**
   * Attribute missing flag for: ExpGrpBaseMemberIch1ChargeBasePpdColInd
   **/
  public char ExpGrpBaseMemberIch1ChargeBasePpdColInd_AS[] = new char[350];
  /**
   * Attribute for: ExpGrpBaseMemberIch1ChargeBasePpdColInd
   * Domain: Text
   * Length: 1
   * Varying Length: N
   **/
  public String ExpGrpBaseMemberIch1ChargeBasePpdColInd[] = new String[350];
  /**
   * Attribute missing flag for: ExpGrpBaseMemberIch1ChargeBaseEffectiveDate
   **/
  public char ExpGrpBaseMemberIch1ChargeBaseEffectiveDate_AS[] = new char[350];
  /**
   * Attribute for: ExpGrpBaseMemberIch1ChargeBaseEffectiveDate
   * Domain: Date
   * Length: 8
   **/
  public int ExpGrpBaseMemberIch1ChargeBaseEffectiveDate[] = new int[350];
  /**
   * Attribute missing flag for: ExpGrpBaseMemberIch1ChargeBaseEffectiveEndDate
   **/
  public char ExpGrpBaseMemberIch1ChargeBaseEffectiveEndDate_AS[] = new char[350];
  /**
   * Attribute for: ExpGrpBaseMemberIch1ChargeBaseEffectiveEndDate
   * Domain: Date
   * Length: 8
   **/
  public int ExpGrpBaseMemberIch1ChargeBaseEffectiveEndDate[] = new int[350];
  /**
   * Attribute missing flag for: ExpGrpBaseMemberIch1ChargeBaseHasBeenDeletedInd
   **/
  public char ExpGrpBaseMemberIch1ChargeBaseHasBeenDeletedInd_AS[] = new char[350];
  /**
   * Attribute for: ExpGrpBaseMemberIch1ChargeBaseHasBeenDeletedInd
   * Domain: Text
   * Length: 1
   * Varying Length: N
   **/
  public String ExpGrpBaseMemberIch1ChargeBaseHasBeenDeletedInd[] = new String[350];
  /**
   * Default Constructor
   **/
  
  public B25EX710_OA()
  {
    reset();
  }
  /**
   * Copy Constructor
   **/
  
  public B25EX710_OA(B25EX710_OA orig)
  {
    copyFrom(orig);
  }
  /**
   * Static instance creator function
   **/
  
  public static B25EX710_OA getInstance()
  {
    return new B25EX710_OA();
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
    return(new B25EX710_OA(this));
  }
  /**
   * Resets all properties to the defaults.
   **/
  
  public void reset()
  {
    ExpEwwComponentReturnCode_AS = ' ';
    ExpEwwComponentReturnCode = 0;
    ExpEwwComponentReasonCode_AS = ' ';
    ExpEwwComponentReasonCode = 0;
    ExpEwwComponentSeverityCode_AS = ' ';
    ExpEwwComponentSeverityCode = " ";
    ExpEwwComponentRollbackIndicator_AS = ' ';
    ExpEwwComponentRollbackIndicator = " ";
    ExpEwwComponentOriginServid_AS = ' ';
    ExpEwwComponentOriginServid = 0.0;
    ExpEwwSuppliedEvaluationDate_AS = ' ';
    ExpEwwSuppliedEvaluationDate = 00000000;
    ExpEwwSuppliedNextGroupInd_AS = ' ';
    ExpEwwSuppliedNextGroupInd = " ";
    ExpGrpBaseMembers_MA = 0;
    for(int a = 0; a < 350; a++)
    {
      ExpGrpBaseMembers_AC[a] = ' ';
      ExpGrpBaseMemberIch1ChargeBaseBaseCode_AS[a] = ' ';
      ExpGrpBaseMemberIch1ChargeBaseBaseCode[a] = "      ";
      ExpGrpBaseMemberIch1ChargeBaseOwningChargeCode_AS[a] = ' ';
      ExpGrpBaseMemberIch1ChargeBaseOwningChargeCode[a] = "      ";
      ExpGrpBaseMemberIch1ChargeBaseInstanceId_AS[a] = ' ';
      ExpGrpBaseMemberIch1ChargeBaseInstanceId[a] = 0.0;
      ExpGrpBaseMemberIch1ChargeBaseChargeCode_AS[a] = ' ';
      ExpGrpBaseMemberIch1ChargeBaseChargeCode[a] = "      ";
      ExpGrpBaseMemberIch1ChargeBaseOriginCountryCode_AS[a] = ' ';
      ExpGrpBaseMemberIch1ChargeBaseOriginCountryCode[a] = "   ";
      ExpGrpBaseMemberIch1ChargeBaseDestinationCountryCode_AS[a] = ' ';
      ExpGrpBaseMemberIch1ChargeBaseDestinationCountryCode[a] = "   ";
      ExpGrpBaseMemberIch1ChargeBasePpdColInd_AS[a] = ' ';
      ExpGrpBaseMemberIch1ChargeBasePpdColInd[a] = " ";
      ExpGrpBaseMemberIch1ChargeBaseEffectiveDate_AS[a] = ' ';
      ExpGrpBaseMemberIch1ChargeBaseEffectiveDate[a] = 00000000;
      ExpGrpBaseMemberIch1ChargeBaseEffectiveEndDate_AS[a] = ' ';
      ExpGrpBaseMemberIch1ChargeBaseEffectiveEndDate[a] = 00000000;
      ExpGrpBaseMemberIch1ChargeBaseHasBeenDeletedInd_AS[a] = ' ';
      ExpGrpBaseMemberIch1ChargeBaseHasBeenDeletedInd[a] = " ";
    }
  }
  /**
   * Sets the current state of the instance to the VDF version.
   **/
  public void setFromVDF(VDF vdf)
  {
    throw new RuntimeException("can only execute setFromVDF for a Procedure Step.");
  }
  
  /**
   * Gets the VDF version of the current state of the instance.
   **/
  public VDF getVDF()
  {
    throw new RuntimeException("can only execute getVDF for a Procedure Step.");
  }
  
  /**
   * Sets the current instance based on the passed view.
   **/
  public void copyFrom(IExportView orig)
  {
    this.copyFrom((B25EX710_OA) orig);
  }
  
  /**
   * Sets the current instance based on the passed view.
   **/
  public void copyFrom(B25EX710_OA orig)
  {
    ExpEwwComponentReturnCode_AS = orig.ExpEwwComponentReturnCode_AS;
    ExpEwwComponentReturnCode = orig.ExpEwwComponentReturnCode;
    ExpEwwComponentReasonCode_AS = orig.ExpEwwComponentReasonCode_AS;
    ExpEwwComponentReasonCode = orig.ExpEwwComponentReasonCode;
    ExpEwwComponentSeverityCode_AS = orig.ExpEwwComponentSeverityCode_AS;
    ExpEwwComponentSeverityCode = orig.ExpEwwComponentSeverityCode;
    ExpEwwComponentRollbackIndicator_AS = orig.ExpEwwComponentRollbackIndicator_AS;
    ExpEwwComponentRollbackIndicator = orig.ExpEwwComponentRollbackIndicator;
    ExpEwwComponentOriginServid_AS = orig.ExpEwwComponentOriginServid_AS;
    ExpEwwComponentOriginServid = orig.ExpEwwComponentOriginServid;
    ExpEwwSuppliedEvaluationDate_AS = orig.ExpEwwSuppliedEvaluationDate_AS;
    ExpEwwSuppliedEvaluationDate = orig.ExpEwwSuppliedEvaluationDate;
    ExpEwwSuppliedNextGroupInd_AS = orig.ExpEwwSuppliedNextGroupInd_AS;
    ExpEwwSuppliedNextGroupInd = orig.ExpEwwSuppliedNextGroupInd;
    ExpGrpBaseMembers_MA = orig.ExpGrpBaseMembers_MA;
    for(int a = 0; a < 350; a++)
    {
      ExpGrpBaseMembers_AC[a] = orig.ExpGrpBaseMembers_AC[a];
      ExpGrpBaseMemberIch1ChargeBaseBaseCode_AS[a] = orig.ExpGrpBaseMemberIch1ChargeBaseBaseCode_AS[a];
      ExpGrpBaseMemberIch1ChargeBaseBaseCode[a] = orig.ExpGrpBaseMemberIch1ChargeBaseBaseCode[a];
      ExpGrpBaseMemberIch1ChargeBaseOwningChargeCode_AS[a] = orig.ExpGrpBaseMemberIch1ChargeBaseOwningChargeCode_AS[a];
      ExpGrpBaseMemberIch1ChargeBaseOwningChargeCode[a] = orig.ExpGrpBaseMemberIch1ChargeBaseOwningChargeCode[a];
      ExpGrpBaseMemberIch1ChargeBaseInstanceId_AS[a] = orig.ExpGrpBaseMemberIch1ChargeBaseInstanceId_AS[a];
      ExpGrpBaseMemberIch1ChargeBaseInstanceId[a] = orig.ExpGrpBaseMemberIch1ChargeBaseInstanceId[a];
      ExpGrpBaseMemberIch1ChargeBaseChargeCode_AS[a] = orig.ExpGrpBaseMemberIch1ChargeBaseChargeCode_AS[a];
      ExpGrpBaseMemberIch1ChargeBaseChargeCode[a] = orig.ExpGrpBaseMemberIch1ChargeBaseChargeCode[a];
      ExpGrpBaseMemberIch1ChargeBaseOriginCountryCode_AS[a] = orig.ExpGrpBaseMemberIch1ChargeBaseOriginCountryCode_AS[a];
      ExpGrpBaseMemberIch1ChargeBaseOriginCountryCode[a] = orig.ExpGrpBaseMemberIch1ChargeBaseOriginCountryCode[a];
      ExpGrpBaseMemberIch1ChargeBaseDestinationCountryCode_AS[a] = orig.ExpGrpBaseMemberIch1ChargeBaseDestinationCountryCode_AS[a];
      ExpGrpBaseMemberIch1ChargeBaseDestinationCountryCode[a] = orig.ExpGrpBaseMemberIch1ChargeBaseDestinationCountryCode[a];
      ExpGrpBaseMemberIch1ChargeBasePpdColInd_AS[a] = orig.ExpGrpBaseMemberIch1ChargeBasePpdColInd_AS[a];
      ExpGrpBaseMemberIch1ChargeBasePpdColInd[a] = orig.ExpGrpBaseMemberIch1ChargeBasePpdColInd[a];
      ExpGrpBaseMemberIch1ChargeBaseEffectiveDate_AS[a] = orig.ExpGrpBaseMemberIch1ChargeBaseEffectiveDate_AS[a];
      ExpGrpBaseMemberIch1ChargeBaseEffectiveDate[a] = orig.ExpGrpBaseMemberIch1ChargeBaseEffectiveDate[a];
      ExpGrpBaseMemberIch1ChargeBaseEffectiveEndDate_AS[a] = orig.ExpGrpBaseMemberIch1ChargeBaseEffectiveEndDate_AS[a];
      ExpGrpBaseMemberIch1ChargeBaseEffectiveEndDate[a] = orig.ExpGrpBaseMemberIch1ChargeBaseEffectiveEndDate[a];
      ExpGrpBaseMemberIch1ChargeBaseHasBeenDeletedInd_AS[a] = orig.ExpGrpBaseMemberIch1ChargeBaseHasBeenDeletedInd_AS[a];
      ExpGrpBaseMemberIch1ChargeBaseHasBeenDeletedInd[a] = orig.ExpGrpBaseMemberIch1ChargeBaseHasBeenDeletedInd[a];
    }
  }
}