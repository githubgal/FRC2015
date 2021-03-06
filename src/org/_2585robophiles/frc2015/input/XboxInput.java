package org._2585robophiles.frc2015.input;

import org._2585robophiles.lib2585.XboxConstants;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Input from an xbox360 controller
 */
public class XboxInput implements InputMethod {
	
	private Joystick controller;
	
	/**
	 * Initialize a joystick
	 */
	public XboxInput() {
		controller = new Joystick(0);
	}
	
	/**
	 * Use the given joystick
	 * @param joystick the xbox360 contoller
	 */
	public XboxInput(Joystick joystick){
		controller = joystick;
	}

	/* (non-Javadoc)
	 * @see org._2585robophiles.frc2015.input.InputMethod#forwardMovement()
	 */
	@Override
	public double forwardMovement() {
		return (-controller.getRawAxis(1));// left stick y-axis
	}

	/* (non-Javadoc)
	 * @see org._2585robophiles.frc2015.input.InputMethod#sidewaysMovement()
	 */
	@Override
	public double sidewaysMovement() {
		return (-controller.getRawAxis(0));// left stick x-axis
	}

	/* (non-Javadoc)
	 * @see org._2585robophiles.frc2015.input.InputMethod#rotation()
	 */
	@Override
	public double rotation() {
		return controller.getRawAxis(XboxConstants.RIGHT_X_AXIS);
	}

	/* (non-Javadoc)
	 * @see org._2585robophiles.frc2015.input.InputMethod#straightDrive()
	 */
	@Override
	public boolean straightDrive() {
		return controller.getRawButton(XboxConstants.BACK_BUTTON);
	}
	
	/* (non-Javadoc)
	 * @see org._2585robophiles.frc2015.input.InputMethod#joysticks()
	 */
	@Override
	public Joystick[] joysticks() {
		return new Joystick[]{controller};
	}

}
